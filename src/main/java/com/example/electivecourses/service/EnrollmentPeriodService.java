package com.example.electivecourses.service;

import org.springframework.stereotype.Service;

@Service
public interface EnrollmentPeriodService {

    void openEnrollmentPeriod();
    void closeEnrollmentPeriod();
    boolean isEnrollmentPeriodOpen();
}
