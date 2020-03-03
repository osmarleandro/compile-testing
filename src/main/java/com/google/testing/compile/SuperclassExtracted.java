package com.google.testing.compile;

import javax.tools.StandardJavaFileManager;

public abstract class SuperclassExtracted extends ForwardingStandardJavaFileManager {
    public SuperclassExtracted(StandardJavaFileManager fileManager) {
        super(fileManager);
    }
}
