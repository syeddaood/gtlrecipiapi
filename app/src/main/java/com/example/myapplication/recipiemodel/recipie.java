package com.example.myapplication.recipiemodel;

import android.os.Parcel;
import android.os.Parcelable;

public class recipie implements Parcelable {

    private String title;
    private String source_Url;
    private String image;
    private String release_date;
    private int id;
    private int readyInMinutes;
    private int servings;

    private float openlicense;

    protected recipie(Parcel in) {
        title = in.readString();
        source_Url = in.readString();
        image = in.readString();
        release_date = in.readString();
        id = in.readInt();
        readyInMinutes = in.readInt();
        servings = in.readInt();
        openlicense = in.readFloat();
    }

    public static final Creator<recipie> CREATOR = new Creator<recipie>() {
        @Override
        public recipie createFromParcel(Parcel in) {
            return new recipie(in);
        }

        @Override
        public recipie[] newArray(int size) {
            return new recipie[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public recipie(String title, String source_Url, String image, String release_date, int id, int readyInMinutes, int servings, float openlicense) {
        this.title = title;
        this.source_Url = source_Url;
        this.image = image;
        this.release_date = release_date;
        this.id = id;
        this.readyInMinutes = readyInMinutes;
        this.servings = servings;
        this.openlicense = openlicense;
    }

    public String getSource_Url() {
        return source_Url;
    }

    public String getImage() {
        return image;
    }

    public String getRelease_date() {
        return release_date;
    }

    public int getId() {
        return id;
    }

    public int getReadyInMinutes() {
        return readyInMinutes;
    }

    public int getServings() {
        return servings;
    }

    public float getOpenlicense() {
        return openlicense;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(source_Url);
        parcel.writeString(image);
        parcel.writeString(release_date);
        parcel.writeInt(id);
        parcel.writeInt(readyInMinutes);
        parcel.writeInt(servings);
        parcel.writeFloat(openlicense);
    }
}
