import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-records',
  templateUrl: './records.component.html',
  styleUrls: ['./records.component.css']
})
export class RecordsComponent {
  testUser:any;

  constructor(private http:HttpClient) {

  }

  ngOnInit() {

   
    let res = this.http.get("http://localhost:8080/user/get");
   res.subscribe((data)=>{
     // console.log('data',data);
     if(data) {
       console.log(data)
       this.testUser = data;
      }
      else {
        console.log("error")
      }
      
    });
   
  }

}
