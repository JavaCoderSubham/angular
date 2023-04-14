
import { Location } from '@angular/common';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-database',
  templateUrl: './database.component.html',
  styleUrls: ['./database.component.css']
})
export class DatabaseComponent {

  userDetails:UserDetailsModel = {
    userId:"",
    name:"",
    email:"",
    password:""
  };

  getUser:any;

  constructor(private http:HttpClient, private route:Router, private location:Location) {

  }

  ngOnInit() {
    let url = "http://localhost:8080/user/getAll"
    this.http.get(url).subscribe((data) => {
      console.log(data)
      this.getUser = data
    })
  }

  onDelete(id:string) {
    // let id = this.userDetails.userId;
    console.log(id)
    // let requestParam = new HttpParams();
    // requestParam.append("id",id);
    this.http.delete(`http://localhost:8080/user/delete/${id}`).subscribe({
      next:() => {
        window.location.reload();
      }
    });
  }

}

export interface UserDetailsModel {
  userId:string;
  name:string;
  email:string;
  password:string;
}

