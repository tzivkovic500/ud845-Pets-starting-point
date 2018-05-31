package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by Tea on 29.5.2018..
 */

public final class PetContract {
// To prevent someone from accidentally instantiating the contract class,
// give it an empty constructor.
    private PetContract() {}
    /**
    * Inner class that defines constant values for the pets database table.
    * Each entry in the table represents a single pet.
    */
    public static final class PetEntry implements BaseColumns {

    /** Name of database table for pets */
    public static final String TABLE_NAME = "pets";
    /**
    * Unique ID number for the pet (only for use in the database table).
    *
    * Type: INTEGER
    */
    public static final String _ID = BaseColumns._ID;
    /**
    * Name of the pet.
    *
    * Type: TEXT
    */
    public static final String COLUMN_PET_NAME ="name";
    /**
    * Gender of the pet.
    *
    * The only possible values are {@link #GENDER_UNKNOWN}, {@link #GENDER_MALE},
    or {@link #GENDER_FEMALE}.
    *
    * Type: INTEGER
    */
    public static final String COLUMN_PET_GENDER = "gender";
    /**
    * Breed of the pet.
    *
    * * Type: TEXT
    */
    public static final String COLUMN_BREED = "breed";
    /**
    * Weight of the pet.
    *
    * Type: INTEGER
    */
    public static final String COLUMN_PET_WEIGHT = "weight";

    /**
     * Possible values for the pets gender.
     */
    public static final int GENDER_UNKNOWN = 0;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_FEMALE = 2;
    }
}
