package com.example;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

//Table - Concert

@Data
@Entity
@Table(name = "concert")
public class Concert {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    @Column(name = "band_name")
    private String bandName;

    @Column(name = "date_time")
    private LocalDateTime dateTime;

    @Column(name = "stage")
    private String stage;

    @Column(name = "age_limit")
    private Integer ageLimit;

    @Column(name = "band_info")
    private String bandInfo;

    @Column(name = "band_image_url")
    private String bandImageUrl;

    @Column(name = "spotify_id")
    private String spotifyId;

    protected Concert() {
        //Default empty constructor
    }

    public Concert(
            String bandName, LocalDateTime dateTime, String stage, Integer ageLimit,
            String bandInfo, String bandImageUrl, String spotifyId) {
        this.bandName = bandName;
        this.dateTime = dateTime;
        this.stage = stage;
        this.ageLimit = ageLimit;
        this.bandInfo = bandInfo;
        this.bandImageUrl = bandImageUrl;
        this.spotifyId = spotifyId;
    }
}
