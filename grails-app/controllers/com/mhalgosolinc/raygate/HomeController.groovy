package com.mhalgosolinc.raygate
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN', 'ROLE_USER'])
class HomeController {

    def index() { }
}
