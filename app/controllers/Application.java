package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result crafty() {
    	return ok(crafty.render());
    }

    public static Result phaser() {
        return ok(phaser.render());
    }

    public static Result phaserjs() {
        return ok(phaserjs.render());
    }



}
