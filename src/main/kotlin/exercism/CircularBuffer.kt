package com.diogoizele.exercism

import kotlin.collections.ArrayDeque

class EmptyBufferException: Exception() {
    override val message = "Empty buffer is empty"
}

class BufferFullException : Exception() {
    override val message = "Buffer is full"
}

class CircularBuffer<T>(private val size: Int) {

    private val zero = 0
    private val lastIndex = size - 1

    private val array = ArrayDeque<T?>(size)

    private var capacity = 0
    private var readPointer = 0
    private var writePointer = 0

    init {
        initialize()
    }

    private fun initialize() {
        if (array.isEmpty()) {
            for (i in zero until size) {
                array.add(null)
            }
        } else {
            for (i in zero until size) {
                array[i] = null
            }
        }

        capacity = size
        readPointer = 0
        writePointer = 0
    }

    fun read() : T {

        if (capacity == size) {
            throw EmptyBufferException()
        }

        if (readPointer > lastIndex) {
            readPointer = zero
        }

        var element = array[readPointer]

        while (element == null) {
            element = array[++readPointer]
        }

        array[readPointer] = null

        readPointer++
        capacity++

        return element
    }

    fun write(value: T) {

        if (capacity == zero) {
            throw BufferFullException()
        }

        overwrite(value)
    }

    fun overwrite(value: T) {

        if (writePointer > lastIndex) {
            writePointer = zero

            readPointer++

            if (readPointer > lastIndex) {
                readPointer = zero
            }
        } else if (writePointer == lastIndex) {
            readPointer = zero
        }

        array[writePointer++] = value

        if (capacity > zero) {
            capacity--
        }
    }

    fun clear() {
        initialize()
    }
}