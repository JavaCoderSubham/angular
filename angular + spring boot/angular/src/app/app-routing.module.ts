import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { DatabaseComponent } from './database/database.component';
import { RegisterComponent } from './register/register.component';
import { ErrorComponent } from './error/error.component';
import { UpdateComponent } from './update/update.component';

const routes: Routes = [
  {
    component: HomeComponent,
    path:""
  },
  {
    component: DatabaseComponent,
    path: "database"
  },
  {
    component: UpdateComponent,
    path:"update"
  },
  {
    component: RegisterComponent,
    path: "register"
  },
  {
    component: ErrorComponent,
    path: "**"
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
