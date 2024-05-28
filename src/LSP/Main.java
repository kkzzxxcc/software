package LSP;

public class Main {
    public static void main(String[] args) {

        LecturerAtGs lect01 = new LecturerAtGs();
        lect01.Lecturer();

        LecturerNight lect02 = new LecturerNight();
        lect02.Lecturer();

        LecturerWithWork lect03 = new LecturerWithWork();
        lect03.Lecturer();

        LecturerNomal lect04 = new LecturerNomal();
        lect04.Lecturer();
    }
}
