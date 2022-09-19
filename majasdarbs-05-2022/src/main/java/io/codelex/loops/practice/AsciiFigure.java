package io.codelex.loops.practice;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AsciiFigure {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value from 1 to 7 to generate a pyramid.");
        int input = in.nextInt();
        System.out.println(art(input));
    }

    public static String art(int size){

        String line = "";

        switch (size){
            case 1: line = "nullified";
            case 2:
                int g = 0;
                for (int i = 0; i < 4; i++) {
                    for (; g < 4; g++) {
                        line += "/";
                    }
                    line += "\\";
                } line += "\n";
                for (int l = 0; l < 8; l++) {
                    line += "*";
                }  break;
            case 3:
                int j = 0;
                for (int i = 0; i < 8; i++) {
                    for (; j < 8; j++) {
                        line += "/";
                    }
                    line += "\\";
                } line += "\n";
                int m = 0;
                for (int l = 0; l < 8; l++) {
                    for (; m < 8; m++) {
                        if (m < 4) {
                            line += "/";
                        } else {line += "*";}
                    }
                    if (l < 4) {
                        line += "*";
                    } else {line += "\\";};
                } line += "\n";
                for (int l = 0; l < 16; l++) {
                    line += "*";
                }  break;
            case 4:
                int c = 0;
                for (int i = 0; i < 12; i++) {
                    for (; c < 12; c++) {
                        line += "/";
                    }
                    line += "\\";
                } line += "\n";

                int x = 0;
                for (int l = 0; l < 12; l++) {
                    for (; x < 12; x++) {
                        if (x < 8) {
                            line += "/";
                        } else {line += "*";}
                    }
                    if (l < 4) {
                        line += "*";
                    } else {line += "\\";};
                } line += "\n";

                int e = 0;
                for (int l = 0; l < 12; l++) {
                    for (; e < 12; e++) {
                        if (e < 4) {
                            line += "/";
                        } else {line += "*";}
                    }
                    if (l < 8) {
                        line += "*";
                    } else {line += "\\";};
                } line += "\n";

                for (int l = 0; l < 24; l++) {
                line += "*";
                } break;
            case 5:
                int n = 0;
                for (int i = 0; i < 16; i++) {
                    for (; n < 16; n++) {
                        line += "/";
                    }
                    line += "\\";
                } line += "\n";

                int b = 0;
                for (int l = 0; l < 16; l++) {
                    for (; b < 16; b++) {
                        if (b < 12) {
                            line += "/";
                        } else {line += "*";}
                    }
                    if (l < 4) {
                        line += "*";
                    } else {line += "\\";};
                } line += "\n";

                int v = 0;
                for (int l = 0; l < 16; l++) {
                    for (; v < 16; v++) {
                        if (v < 8) {
                            line += "/";
                        } else {line += "*";}
                    }
                    if (l < 8) {
                        line += "*";
                    } else {line += "\\";};
                } line += "\n";

                int z = 0;
                for (int l = 0; l < 16; l++) {
                    for (; z < 16; z++) {
                        if (z < 4) {
                            line += "/";
                        } else {line += "*";}
                    }
                    if (l < 12) {
                        line += "*";
                    } else {line += "\\";};
                } line += "\n";

                for (int l = 0; l < 32; l++) {
                    line += "*";
                } break;

            case 6:
                int f = 0;
                for (int i = 0; i < 20; i++) {
                    for (; f < 20; f++) {
                        line += "/";
                    }
                    line += "\\";
                } line += "\n";

                int d = 0;
                for (int l = 0; l < 20; l++) {
                    for (; d < 20; d++) {
                        if (d < 16) {
                            line += "/";
                        } else {line += "*";}
                    }
                    if (l < 4) {
                        line += "*";
                    } else {line += "\\";};
                } line += "\n";

                int s = 0;
                for (int l = 0; l < 20; l++) {
                    for (; s < 20; s++) {
                        if (s < 12) {
                            line += "/";
                        } else {line += "*";}
                    }
                    if (l < 8) {
                        line += "*";
                    } else {line += "\\";};
                } line += "\n";

                int a = 0;
                for (int l = 0; l < 20; l++) {
                    for (; a < 20; a++) {
                        if (a < 8) {
                            line += "/";
                        } else {line += "*";}
                    }
                    if (l < 12) {
                        line += "*";
                    } else {line += "\\";};
                } line += "\n";

                int q = 0;
                for (int l = 0; l < 20; l++) {
                    for (; q < 20; q++) {
                        if (q < 4) {
                            line += "/";
                        } else {line += "*";}
                    }
                    if (l < 16) {
                        line += "*";
                    } else {line += "\\";};
                } line += "\n";

                for (int l = 0; l < 40; l++) {
                    line += "*";
                } break;

            case 7:
                int o = 0;
                for (int i = 0; i < 20; i++) {
                    for (; o < 20; o++) {
                        line += "/";
                    }
                    line += "\\";
                } line += "\n";

                int i = 0;
                for (int l = 0; l < 20; l++) {
                    for (; i < 20; i++) {
                        if (i < 16) {
                            line += "/";
                        } else {line += "*";}
                    }
                    if (l < 4) {
                        line += "*";
                    } else {line += "\\";};
                } line += "\n";

                int y = 0;
                for (int l = 0; l < 20; l++) {
                    for (; y < 20; y++) {
                        if (y < 12) {
                            line += "/";
                        } else {line += "*";}
                    }
                    if (l < 8) {
                        line += "*";
                    } else {line += "\\";};
                } line += "\n";

                int t = 0;
                for (int l = 0; l < 20; l++) {
                    for (; t < 20; t++) {
                        if (t < 8) {
                            line += "/";
                        } else {line += "*";}
                    }
                    if (l < 12) {
                        line += "*";
                    } else {line += "\\";};
                } line += "\n";

                int r = 0;
                for (int l = 0; l < 20; l++) {
                    for (; r < 20; r++) {
                        if (r < 4) {
                            line += "/";
                        } else {line += "*";}
                    }
                    if (l < 16) {
                        line += "*";
                    } else {line += "\\";};
                } line += "\n";

                int w = 0;
                for (int l = 0; l < 20; l++) {
                    for (; w < 20; w++) {
                        if (w < 4) {
                            line += "/";
                        } else {line += "*";}
                    }
                    if (l < 16) {
                        line += "*";
                    } else {line += "\\";};
                } line += "\n";

                for (int l = 0; l < 40; l++) {
                    line += "*";
                } break;

        } return line;
    }
}
