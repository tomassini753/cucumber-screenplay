package StepsDefinitions;

import Navigation.NavigateTo;
import Task.IniciarSesionTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class loginSteps {

    @Managed
    WebDriver driver;

    Actor actor = Actor.named("El usuario");

    @Before
    public void prepararActor(){actor.can(BrowseTheWeb.with(driver));}


    @Dado("El usuario ingresa a la pagina principal de orangehrm")
    public void el_usuario_ingresa_a_la_pagina_principal_de_orangehrm() {
        actor.attemptsTo(NavigateTo.paginaPrincipal());
    }

    @Cuando("El usuario ingresa un usuario (.*) y contrasenia (.*) correcta")
    public void el_usuario_ingresa_un_usuario_y_contrasenia_correcta(String user, String pass) {

        actor.attemptsTo(
                IniciarSesionTask.con(user,pass)
        );

    }

    @Entonces("Se muestra la pantalla principal del usuario")
    public void se_muestra_la_pantalla_principal_del_usuario() {
        System.out.println("OK");
    }

    @Cuando("El usuario ingresa un usuario y contrasenia incorrecto")
    public void el_usuario_ingresa_un_usuario_y_contrasenia_incorrecto() {
        System.out.println("OK");
    }

    @Entonces("Se muestra un mensaje indicando que el logeo es incorrecto")
    public void se_muestra_un_mensaje_indicando_que_el_logeo_es_incorrecto() {
        System.out.println("OK");
    }

    @Cuando("El usuario se loguea correctamente (.*) (.*)")
    public void el_usuario_se_loguea_correctamente_Admin_admin(String user, String pass) {
        System.out.println("OK");
    }

    @Cuando("Se desloguea")
    public void se_desloguea() {
        System.out.println("OK");
    }

    @Entonces("Se muestra la pantalla de login")
    public void se_muestra_la_pantalla_de_login() {
       System.out.println("OK");
    }

}
