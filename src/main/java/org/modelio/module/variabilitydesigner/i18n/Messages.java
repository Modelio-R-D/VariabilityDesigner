package org.modelio.module.variabilitydesigner.i18n;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b99a64de-3a1e-4403-85e7-059289baa3b1")
public class Messages {
    @objid ("a981e069-187c-4a13-adf0-69c6bec12c42")
    private static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle ("org.modelio.module.variabilitydesigner.i18n.messages");

    @objid ("8582b861-e842-412d-90a4-3bf856859a73")
    private Messages() {
    }

    @objid ("a302a0da-41d1-4840-bd79-9cb813d93938")
    public static String getString(final String key) {
        try {
            return RESOURCE_BUNDLE.getString (key);
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
    }

    @objid ("3bb6d709-8059-441d-a271-4b25ae08188c")
    public static String getString(final String key, final String... params) {
        try {
            return MessageFormat.format (RESOURCE_BUNDLE.getString (key),(Object[]) params);
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
    }

}
