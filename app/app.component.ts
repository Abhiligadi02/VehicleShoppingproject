import { Component } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Myproject1';
}
export class ToolbarBasicExample { }
export class ButtonOverviewExample {navbarOpen = false;

  toggleNavbar() {
    this.navbarOpen = !this.navbarOpen;
  } }
  
export class SelectDisabledExample {
  disableSelect = new FormControl(false);
}
export class MenuOverviewExample {} 


