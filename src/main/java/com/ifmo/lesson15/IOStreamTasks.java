package com.ifmo.lesson15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.doclint.Entity.copy;

/*
    Реализуйте все методы с использованием потоков ввода-вывода.
 */
public class IOStreamTasks {
    public static void main(String[] args) throws IOException {
        File src = new File("/Users/bogdanova.t.yuryesberbank.ru/IdeaProjects/traning-itmo-project/src/main/java/com/ifmo/lesson11/war.txt");
        File dst = new File("/Users/bogdanova.t.yuryesberbank.ru/IdeaProjects/traning-itmo-project/src/main/java/com/ifmo/lesson11/war.txt");

        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {
            copy(in, out);
        }
    }

    /**
     * Полностью копирует один поток в другой.
     *
     * @param src Входящий поток.
     * @param dst Выходящий поток.
     * @throws IOException Будет выброшен в случае ошибки.
     */
    public static void copy(InputStream in, OutputStream out) throws IOException {
        // TODO implement
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
    }

    /**
     * Последовательно разбивает файл на несколько более мелких, равных
     * указанному размеру. Последний файл может быть меньше задданого
     * размера.
     *
     * @param file   Файл, который будет разбит на несколько.
     * @param dstDir Директория, в которой будут созданы файлы меньшего размера.
     * @param size   Размер каждого файла-части, который будет создан.
     * @return Список файлов-частей в том порядке, в котором они должны считываться.
     * @throws IOException Будет выброшен в случае ошибки.
     */
    public static List<File> split(File file, File dstDir, int size) throws IOException {
        //read
        List<File> fileList = new ArrayList<>();
        try (InputStream inputStream = new FileInputStream(file) {
        }) {
            byte[] buf = new byte[size];
            int len;
            while ((len = inputStream.read(buf)) > 0) { //end main file
                ByteArrayOutputStream sb = new ByteArrayOutputStream();
                sb.write(buf, 0, len);
                File smallFile = new File(file.getPath());
                try (Writer writer = new FileWriter(dstDir)) {
                    writer.write(sb.toString());
                    fileList.add(smallFile);
                }
            }
        }
        return fileList;
    }

    /**
     * Собирает из частей один файл.
     *
     * @param files Список файлов в порядке чтения.
     * @param dst   Файл, в который будут записаны все части.
     * @throws IOException Будет выброшен в случае ошибки.
     */
    public static void assembly(List<File> files, File dst) throws IOException {
        for (File smallFile: files
             ) {
            try (Reader reader = new FileReader(smallFile)) {
                StringBuilder sb = new StringBuilder();
                char[] buf;
                buf = new char[512];
                int len;
                while ((len = reader.read(buf)) > 0) { //end main file
                    sb.append(buf, 0, len);
                }
                try (Writer writer = new FileWriter(dst)) {
                    writer.write(sb.toString());
                   // fileList.add(smallFile);
                }
            }


        }


    }

    /**
     * Шифрует/дешифрует поток с помощью XOR. В качестве ключа используется пароль.
     *
     * @param src        Входящий поток, данные которого будут зашифрованы/расшифрованы.
     * @param dst        Выходящий поток, куда будут записаны зашифрованные/расшифрованные данные.
     * @param passphrase Пароль.
     * @throws IOException Будет выброшен в случае ошибки.
     */
    public static void encrypt(InputStream src, OutputStream dst, String passphrase) throws IOException {

    }

    /**
     * Шифрует/дешифрует файл с помощью файла-ключа.
     *
     * @param src Файл, который должен быть зашифрован/расшифрован.
     * @param dst Файл, куда будут записаны зашифрованные/расшифрованные данные.
     * @param key Файл-ключ.
     * @throws IOException Будет выброшен в случае ошибки.
     */
    public static void encrypt(File src, File dst, File key) throws IOException {

    }
}
