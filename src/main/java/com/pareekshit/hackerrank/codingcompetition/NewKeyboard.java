package main.java.com.pareekshit.hackerrank.codingcompetition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewKeyboard {

    /*
     * Complete the 'receivedText' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING S as parameter.
     */

    //HE*><LL#123O -> LLOH
    //HE*<LL123>O

    /*public static String receivedText(String S) {
        // WRITE DOWN YOUR CODE HERE
        StringBuilder sb = new StringBuilder();
        StringBuilder homeCursor = new StringBuilder();
        boolean isNumLockOn = true;
        boolean isHomeKey = false;
        for (char character : S.toCharArray()) {
            switch (character) {
                case '<':
                    sb.insert(0, homeCursor);
                    homeCursor.setLength(0);
                    isHomeKey = true;
                    break;
                case '>':
                    isHomeKey = false;
                    sb.insert(0, homeCursor);
                    homeCursor.setLength(0);
                    break;
                case '*':
                    try {
                        if (isHomeKey) {
                            homeCursor.deleteCharAt(homeCursor.length() - 1);
                        } else {
                            sb.deleteCharAt(sb.length() - 1);
                        }
                    } catch (Exception ignored) {
                        //
                    }
                    break;
                case '#':
                    isNumLockOn = !isNumLockOn;
                    break;
                default:
                    if (Character.isDigit(character)) {
                        if (isNumLockOn) {
                            if (isHomeKey) {
                                homeCursor.append(character);
                            } else sb.append(character);
                        }
                    } else {
                        if (isHomeKey) {
                            homeCursor.append(character);
                        } else sb.append(character);
                    }
                    break;
            }
        }
        if (homeCursor.length() > 0) {
            sb.insert(0, homeCursor);
            homeCursor.setLength(0);
        }
        return sb.toString();
    }*/

    public static String receivedText(String S) {
        // WRITE DOWN YOUR CODE HERE
        List<Character> chars = new ArrayList<>();
        int cursorPosition = -1;
        boolean isNumLockOn = true;
        boolean isHomeKey = false;
        for (char character : S.toCharArray()) {
            switch (character) {
                case '<':
                    isHomeKey = true;
                    cursorPosition = 0;
                    break;
                case '>':
                    isHomeKey = false;
                    cursorPosition = -1;
                    break;
                case '*':
                    try {
                        if (isHomeKey) {
                            chars.remove(cursorPosition);
                        } else {
                            chars.remove(chars.size() - 1);
                        }
                    } catch (Exception ignored) {
                        //
                    }
                    break;
                case '#':
                    isNumLockOn = !isNumLockOn;
                    break;
                default:
                    if (Character.isDigit(character)) {
                        if (isNumLockOn) {
                            if (isHomeKey) {
                                chars.add(cursorPosition, character);
                                cursorPosition++;
                            } else chars.add(character);
                        }
                    } else {
                        if (isHomeKey) {
                            chars.add(cursorPosition, character);
                            cursorPosition++;
                        } else chars.add(character);
                    }
                    break;
            }
        }
        return chars.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = bufferedReader.readLine();

        String result = receivedText(S);
        System.out.println(result);
        bufferedReader.close();

    }
}
