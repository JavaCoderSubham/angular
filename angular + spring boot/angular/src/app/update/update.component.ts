import { Component } from '@angular/core';
import { UserDetails } from '../register/register.component';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent {

  model:UserDetails = {
    userId:"",
    name:"",
    email:"",
    password:""
  }

  constructor(private route:Router, private http:HttpClient) {

  }

  ngOnInit() {

  }

  onUpdate() {
    let url = `http://localhost:8080/user/update/${this.model.userId}`
    
    this.http.post(url,this.model).subscribe({
      next:() => {
        this.route.navigateByUrl("database")
      }
    })


  }


}
