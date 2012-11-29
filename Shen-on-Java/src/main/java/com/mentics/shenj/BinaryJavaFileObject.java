package com.mentics.shenj;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;

import javax.lang.model.element.Modifier;
import javax.lang.model.element.NestingKind;
import javax.tools.JavaFileObject;


public class BinaryJavaFileObject implements JavaFileObject {
    private String className;
    private byte[] bytes;


    public BinaryJavaFileObject(String cls, byte[] bytes) {
        this.className = cls;
        this.bytes = bytes;
    }

    @Override
    public URI toUri() {
        try {
            return new URI("memory://" + className);
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getName() {
        return className;
    }

    @Override
    public InputStream openInputStream() throws IOException {
        return new ByteArrayInputStream(bytes);
    }

    @Override
    public OutputStream openOutputStream() throws IOException {
        throw new ShenException("No output to classes for now.");
    }

    @Override
    public Reader openReader(boolean ignoreEncodingErrors) throws IOException {
        throw new ShenException("No reader allowed.");
    }

    @Override
    public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
        throw new ShenException("No char content allowed.");
    }

    @Override
    public Writer openWriter() throws IOException {
        throw new ShenException("No writer allowed.");
    }

    @Override
    public long getLastModified() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean delete() {
        throw new ShenException("No deleting allowed.");
    }

    @Override
    public Kind getKind() {
        return Kind.CLASS;
    }

    @Override
    public boolean isNameCompatible(String simpleName, Kind kind) {
        // TODO: only compare simple name not FQN?
        System.out.println("name compat: "+simpleName+", "+className);
        return kind == Kind.CLASS && simpleName.equals(className);
    }

    @Override
    public NestingKind getNestingKind() {
        // TODO Auto-generated method stub
        return className.contains("$") ? NestingKind.ANONYMOUS : NestingKind.TOP_LEVEL;
    }

    @Override
    public Modifier getAccessLevel() {
        return Modifier.PUBLIC;
    }
}
