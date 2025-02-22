package com.abhishek.ticket_booking_system.utils;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class UserServiceutill {
    public static String hashPassword(String plainPassword) {
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }

    public static boolean checkPassword(String plainPassword, String hashedPassword) {
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }

}
