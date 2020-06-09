package com.hazelcast.tricorder;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
//        Machine client = new Machine();
//        client.setDirectory(new File("/java/tests/profiler/2020-06-03__11_13_44/A2_W1-3.80.130.125-litemember/"));
//        client.analyze();

        Diagnostics server = new Diagnostics();
        server.setDirectory(new File("member"));
        server.analyze();
        mainWindow.add(server);

        mainWindow.getJFrame().setVisible(true);

//        Iterator<Map.Entry<Long, String>> s = server.between(Machine.TYPE_INVOCATION_PROFILER, Long.MIN_VALUE, Long.MAX_VALUE);
//        while (s.hasNext()) {
//            System.out.println(s.next().getValue());
//        }
    }
}
