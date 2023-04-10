import { Component } from '@angular/core';

@Component({
  selector: 'app-serve',
  templateUrl: './serve.component.html',
  styleUrls: ['./serve.component.css']
})
export class ServeComponent {
  serverStatus:string = ''

  constructor() {
    this.serverStatus = Math.random() > 0.5 ? 'offline' : 'online';
  }

  getColor() {
    return this.serverStatus === 'online' ? 'green' : 'red';
  }
}
