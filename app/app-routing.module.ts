import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LogInComponent } from './log-in/log-in.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { FirstPageComponent } from './first-page/first-page.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { PrivacyComponent } from './privacy/privacy.component';
import { TermsComponent } from './terms/terms.component';
import { CartComponent } from './cart/cart.component';
import { CarproductComponent } from './carproduct/carproduct.component';
import { BikeproductComponent } from './bikeproduct/bikeproduct.component';
import { BugaticarComponent } from './carproduct/bugaticar/bugaticar.component';
import { SuzukiComponent } from './bikeproduct/suzuki/suzuki.component';

const routes: Routes = [
  {path:'',redirectTo:'firstpage',pathMatch:'full'},
  {path:'login',component:LogInComponent},
  {path:'signup',component:SignUpComponent},
  {path:'firstpage',component:FirstPageComponent},
  { path: 'home', component: HomeComponent },
  { path: 'about', component: AboutComponent },
  { path: 'privacy', component: PrivacyComponent },
  { path: 'terms', component: TermsComponent },
  { path: 'cart', component:CartComponent},
  { path: 'carproduct', component:CarproductComponent},
  {path: 'bikeproduct', component:BikeproductComponent},
  {path: 'Bugaticar',component:BugaticarComponent},
  {path: 'suzuki', component:SuzukiComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
