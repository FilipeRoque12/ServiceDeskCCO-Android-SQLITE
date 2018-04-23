package br.usjt.desvweb.servicedeskcco.model;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.lang.reflect.Field;

import br.usjt.desvweb.servicedeskcco.R;

/**
 * Created by Filipe Roque on 21/04/18.
 */

public class Util {

    public static Drawable getDrawbleDinamic(Context contexto, String nomeImagem){
        Class<?> classe = R.drawable.class;
        try {
            Field idField = classe.getDeclaredField(nomeImagem);
            int id = idField.getInt(idField);
            return contexto.getResources().getDrawable(id, null);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
