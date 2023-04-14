import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormComponent } from './form/form.component';
import { ErrorPageComponent } from './error-page/error-page.component';
import { HomeComponent } from './home/home.component';
import { RecordsComponent } from './records/records.component';

const routes: Routes = [
  {
    component: FormComponent,
    path: "form"
  },
  {
    component: HomeComponent,
    path: ""
  },
  {
    component: RecordsComponent,
    path: "records"
  },
  {
    component: ErrorPageComponent,
    path: "**"
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
