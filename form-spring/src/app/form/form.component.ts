import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {

  model:TestUser = {
    name: "",
    email: "",
    password: ""
  };

  constructor(private http:HttpClient, private router:Router) {

  }

  onSubmitSendForm() {
    // alert(event);
    let url = "http://localhost:8080/user/create"
    this.http.post("http://localhost:8080/user/create",this.model).subscribe({
      next:() => {
        this.router.navigateByUrl("records")
      }
    })
  }

}


export interface TestUser {
  name:string;
  email:string;
  password:string;
}