package com.nordwest.university_app;

public final class Contract {

    //to avoid accidental initialization of this class the constructor was declared private
    private Contract(){

    }

    //create constant variables for database_name and version
    public static final String DATABASE_NAME = "university.db";
    public static final int DATABASE_VERSION = 1;

    //inner class with the DB schema

    public static class StudentEntry{

        public static final String TABLE_USER_NAME = "_user_";
        public static final String STUDENT_FNAME = "_fn_";
        public static final String STUDENT_SNAME = "_sn_";
        public static final String STUDENT_EMAIL = "_email_";
        public static final String STUDENT_ID = "_student_id_";
        public static final String STUDENT_GROUP = "_group_";
        public static final String STUDENT_PASWD = "_password_";




        public static String actualUserFirstName;
        public static String actualUserSecondName;
        public static String actualUserGroupName;
        public static String actualUserEmail;
        public static String actualUserStudentID;

    }
    public static class ReservationEntry {
        public static final String TABLE_RESERVATION_NAME = "_reservations_";
        public static final String RESERVATION_ID = "_reservations_id_";
        public static final String USER_ID = "_user_id_";
        public static final String BOOK_ID = "_book_id_";
    }

}

