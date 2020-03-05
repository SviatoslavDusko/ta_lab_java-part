package com.epam.lab.hw_6_logging;

import com.epam.lab.hw_6_logging.log.View;
import com.epam.lab.hw_6_logging.log.View2;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        view.logView();

        View2 view2 = new View2();
        view2.view();
    }
}
