import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-first-page',
  templateUrl: './first-page.component.html',
  styleUrls: ['./first-page.component.css']
})
export class FirstPageComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

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
