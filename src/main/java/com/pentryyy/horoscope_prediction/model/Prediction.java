package com.pentryyy.horoscope_prediction.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

import com.pentryyy.horoscope_prediction.enumeration.GenderType;
import com.pentryyy.horoscope_prediction.enumeration.PredictionType;
import com.pentryyy.horoscope_prediction.enumeration.ZodiacType;

@Entity
@Getter
@Setter
@Table(name = "predictions")
public class Prediction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "prediction_text", nullable = false, length = 500)
    private String predictionText;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false)
    private GenderType gender;

    @Enumerated(EnumType.STRING)
    @Column(name = "zodiac", nullable = false)
    private ZodiacType zodiac;

    @Enumerated(EnumType.STRING)
    @Column(name = "prediction_type", nullable = false)
    private PredictionType predictionType;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}