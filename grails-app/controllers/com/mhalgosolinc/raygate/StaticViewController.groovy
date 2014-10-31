package com.mhalgosolinc.raygate
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN', 'ROLE_USER'])
class StaticViewController {

    def index() { }
    
    def view = {
        render(view:params.view)
    }
}
