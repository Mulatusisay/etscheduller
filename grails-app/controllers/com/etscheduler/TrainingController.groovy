package com.etscheduler

import org.springframework.security.access.annotation.Secured

@Secured(['ROLE_ADMIN'])
class TrainingController {
    def Scaffold=true;
    def index() {}
}