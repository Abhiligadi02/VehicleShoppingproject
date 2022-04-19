import { Component, OnInit  } from '@angular/core';
 

@Component({
  selector: 'app-log-in',
  templateUrl: './log-in.component.html',
  styleUrls: ['./log-in.component.css']
})
export class LogInComponent implements OnInit {
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
}

export class ButtonHarnessExample {
  clicked = false;
}