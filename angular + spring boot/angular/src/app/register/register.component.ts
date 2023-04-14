import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {

  constructor(private http:HttpClient, private route:Router) {

  }

  model:UserDetails = {
    userId:"",
    name:"",
    email:"",
    password:""
  };

  onCreate() {
    let url = "http://localhost:8080/user/create"
    
    this.http.post(url,this.model).subscribe({
      next:() => {
        this.route.navigateByUrl("")
      }
    })


  }

}

export interface UserDetails {
  userId:string;
  name:string;
  email:string;
  password:string;
}
