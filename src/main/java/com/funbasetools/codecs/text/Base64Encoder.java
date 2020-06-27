package com.funbasetools.codecs.text;

import com.funbasetools.codecs.BinaryToTextEncoder;

import java.util.Base64;

public enum Base64Encoder implements BinaryToTextEncoder {
    STANDARD(Base64.getEncoder()),
    MIME(Base64.getMimeEncoder()),
    URL(Base64.getUrlEncoder());

    private final Base64.Encoder innerEncoder;

    Base64Encoder(Base64.Encoder innerEncoder) {
        this.innerEncoder = innerEncoder;
    }

    @Override
    public String encode(byte[] source) {
        return innerEncoder.encodeToString(source);
    }
}
