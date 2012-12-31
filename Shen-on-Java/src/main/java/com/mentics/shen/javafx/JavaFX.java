package com.mentics.shen.javafx;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.ShenException;
import com.sun.javafx.application.PlatformImpl;


public class JavaFX {
    public static Runnable newRunnable(final Lambda lam) {
        return new Runnable() {
            @Override
            public void run() {
                try {
                    lam.apply();
                } catch (Exception e) {
                    ShenException.rethrow(e);
                }
            }
        };
    }

    public static void startApp(Runnable r) {
        PlatformImpl.startup(r);
    }

    public static void addKeyPressedHandler(Object receiver, final Lambda lam) {
        ((Node) receiver).addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ev) {
                try {
                    lam.apply(ev);
                } catch (Exception e) {
                    ShenException.rethrow(e);
                }
            }
        });
    }

    public static void addEventFilter(Object receiver, final Object type, final Lambda lam) {
        ((Node) receiver).addEventFilter((EventType) type, new EventHandler() {
            @Override
            public void handle(Event ev) {

            }
        });
    }
}
