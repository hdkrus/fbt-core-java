package com.funbasetools.codecs.zip;

import com.funbasetools.codecs.BinaryEntriesMapDecoder;
import lombok.Builder;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Builder
public class ZipDecoder extends BinaryEntriesMapDecoder<ZipEntry> {

    @Override
    protected InputStream getNextEntryStream(InputStream inputStream) {
        return new ZipInputStream(inputStream);
    }

    @Override
    protected ZipEntry getNextEntry(InputStream inputStream) throws IOException {
        return ((ZipInputStream) inputStream).getNextEntry();
    }
}
