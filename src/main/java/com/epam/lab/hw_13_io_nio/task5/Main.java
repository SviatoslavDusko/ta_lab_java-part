package com.epam.lab.hw_13_io_nio.task5;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getListOfLine());
        System.out.println(main.getCommentsList());
    }

    private List<String> getListOfLine() {
        String[] strings = getStringFromFile().split("\n");
        List<String> returnList = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].trim().equals("") || strings[i].trim().length() < 3) {
                continue;
            }
            returnList.add(strings[i].trim());
        }
        return returnList;
    }

    private List getCommentsList() {
        String comment = "";
        List<String> returnList = new ArrayList<>();
        for (int i = 0; i < getListOfLine().size(); i++) {
            if (!getListOfLine().get(i).contains("/")) {
                continue;
            } else if (!getListOfLine().get(i).contains("\"")) {
                if (getListOfLine().get(i).contains("//")) {
                    returnList.add(getListOfLine().get(i).substring(getListOfLine().get(i).indexOf("//") + 2));
                } else if (getListOfLine().get(i).contains("/*") && getListOfLine().get(i).contains("*/")) {
                    returnList.add(getListOfLine().get(i)
                            .substring(getListOfLine().get(i).indexOf("/*") + 2, getListOfLine().get(i).indexOf("*/")));
                } else if (getListOfLine().get(i).contains("/*") && !getListOfLine().get(i).contains("*/")) {
                    comment += getListOfLine().get(i).substring(getListOfLine().get(i).indexOf("/*") + 2).trim();
                    i++;
                    while (!getListOfLine().get(i).contains("*/")) {
                        if (getListOfLine().get(i).substring(0, 1).equals("*"))
                            comment += getListOfLine().get(i).substring(1).trim();
                        else {
                            comment += getListOfLine().get(i).trim();
                        }
                        i++;
                    }
                    if (getListOfLine().get(i).contains("*/")) {
                        if (getListOfLine().get(i).substring(0, 1).equals("*")) {
                            comment += getListOfLine().get(i).substring(1, getListOfLine().get(i).indexOf("*/")).trim();
                        } else {
                            comment += getListOfLine().get(i).substring(0, getListOfLine().get(i).indexOf("*/")).trim();
                        }
                    }
                    returnList.add(comment);
                    comment = "";
                }
            } else {
                int countOfQuote = 0;
                for (int j = 0; j < getListOfLine().get(i).length(); j++) {
                    if ("\"".equals(getListOfLine().get(i).charAt(j) + "")) {
                        countOfQuote++;
                    } else {
                        if ((getListOfLine().get(i).charAt(j) + "").equals("/") && countOfQuote % 2 == 0) {
                            j++;
                            if ((getListOfLine().get(i).charAt(j) + "").equals("*")) {
                                if (getListOfLine().get(i).substring(j).contains("*/")) {
                                    returnList.add(getListOfLine().get(i)
                                            .substring(j + 1, getListOfLine().get(i).lastIndexOf("*/")));
                                    break;
                                } else {
                                    j++;
                                    comment += getListOfLine().get(i).substring(j);
                                    i++;
                                    while (!getListOfLine().get(i).contains("*/")) {
                                        if (getListOfLine().get(i).substring(0, 1).equals("*"))
                                            comment += getListOfLine().get(i).substring(1).trim();
                                        else {
                                            comment += getListOfLine().get(i).trim();
                                        }
                                        i++;
                                    }
                                    if (getListOfLine().get(i).contains("*/")) {
                                        if (getListOfLine().get(i).substring(0, 1).equals("*")) {
                                            comment += getListOfLine().get(i)
                                                    .substring(1, getListOfLine().get(i).indexOf("*/")).trim();
                                        } else {
                                            comment += getListOfLine().get(i)
                                                    .substring(0, getListOfLine().get(i).indexOf("*/")).trim();
                                        }
                                    }
                                    returnList.add(comment);
                                    comment = "";
                                }
                            } else if ((getListOfLine().get(i).charAt(j) + "").equals("/")) {
                                returnList.add(getListOfLine().get(i).substring(j + 1));
                            }
                        }
                    }
                }
            }
        }
        return returnList;
    }

    private String getStringFromFile() {
        String text = "";
        FileInputStream fis;
        InputStreamReader isr;
        try {
            fis = new FileInputStream("src/main/java/com/epam/lab/io_nio/task5/TestClass.java");
            isr = new InputStreamReader(fis);
            int a;
            while ((a = isr.read()) != -1) {
                text += (char) a;
            }
            fis.close();
            isr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
