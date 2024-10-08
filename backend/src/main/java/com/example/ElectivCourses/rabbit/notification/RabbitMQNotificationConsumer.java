package com.example.ElectivCourses.rabbit.notification;

import com.example.ElectivCourses.rabbit.audit.AuditLogger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQNotificationConsumer {
    private final AuditLogger auditLogger;

    public RabbitMQNotificationConsumer(AuditLogger auditLogger) {
        this.auditLogger = auditLogger;
    }

    @RabbitListener(queues = "notification-queue")
    public void receiveNotification(String message) {

        auditLogger.logMessageReceived(message);
        auditLogger.logMessageProcessed(message);}
}
