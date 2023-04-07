import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-basic';
  serverName:string = ""
  serverCreated:boolean = false

  onCreateServer() {
    this.serverCreated = true
  }

}
