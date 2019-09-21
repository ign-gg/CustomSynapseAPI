package org.itxtech.synapseapi.messaging;

@SuppressWarnings("serial")
public class MessageTooLargeException extends RuntimeException {

    public MessageTooLargeException() {
        this("Attempted to send a plugin message that was too large. The maximum length is 32766 bytes.");
    }

    public MessageTooLargeException(byte[] message) {
        this(message.length);
    }

    public MessageTooLargeException(int length) {
        this("Attempted to send a plugin message that was too large. The maximum length is 32766 bytes (tried to send one that is " + length + " bytes long).");
    }

    public MessageTooLargeException(String msg) {
        super(msg);
    }
}