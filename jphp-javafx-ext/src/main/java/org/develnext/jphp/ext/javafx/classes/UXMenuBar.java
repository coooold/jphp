package org.develnext.jphp.ext.javafx.classes;

import javafx.collections.ObservableList;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import org.develnext.jphp.ext.javafx.JavaFXExtension;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Property;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Name(JavaFXExtension.NAMESPACE + "UXMenuBar")
public class UXMenuBar extends UXControl {
    interface WrappedInterface {
        @Property boolean useSystemMenuBar();
        @Property ObservableList<Menu> menus();
    }

    public UXMenuBar(Environment env, MenuBar wrappedObject) {
        super(env, wrappedObject);
    }

    public UXMenuBar(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Override
    public MenuBar getWrappedObject() {
        return (MenuBar) super.getWrappedObject();
    }

    @Signature
    public void __construct() {
        __wrappedObject = new MenuBar();
    }
}
