package com.epam.lab.hw_5_exception.exceptionsTask2;

import com.epam.lab.hw_5_exception.exceptionsTask2.enums.Color;
import com.epam.lab.hw_5_exception.exceptionsTask2.enums.Type;
import com.epam.lab.hw_5_exception.exceptionsTask2.enums.enum_exceptions.ColorException;
import com.epam.lab.hw_5_exception.exceptionsTask2.enums.enum_exceptions.TypeException;

public class Plants {
    private Color color;
    private Type type;
    private int size;

    public Plants(Color color, int size, Type type) throws ColorException, TypeException {
        this.color = verifyColor(color);
        this.type = verifyType(type);
        this.size = size;
    }

    private Color verifyColor(Color color) throws ColorException {
        if (color.equals(Color.WHITE)) {
            throw new ColorException("Color Exception");
        } else {
            return color;
        }
    }

    private Type verifyType(Type type) throws TypeException {
        if (type.equals(Type.ALGAE)) {
            throw new TypeException("Type Exception");
        } else {
            return type;
        }
    }

    @Override
    public String toString() {
        return "Plant: color = " + color + ", size = " + size + ", type = " + type + ";";
    }
}
