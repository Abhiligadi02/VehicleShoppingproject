import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LogInComponent } from './log-in/log-in.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import {MatButtonModule} from '@angular/material/button';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { PrivacyComponent } from './privacy/privacy.component';
import { TermsComponent } from './terms/terms.component';
import { CartComponent } from './cart/cart.component';
import { HttpClientModule } from '@angular/common/http';
import { FirstPageComponent } from './first-page/first-page.component';
import { CarproductComponent } from './carproduct/carproduct.component';
import {MatMenuModule} from '@angular/material/menu';
import { BikeproductComponent } from './bikeproduct/bikeproduct.component';
import { BugaticarComponent } from './carproduct/bugaticar/bugaticar.component';
import { SuzukiComponent } from './bikeproduct/suzuki/suzuki.component';
 

@NgModule({
  declarations: [
    AppComponent,
    LogInComponent,
    SignUpComponent,
    HomeComponent,
    AboutComponent,
    PrivacyComponent,
    TermsComponent,
    CartComponent,
    FirstPageComponent,
    CarproductComponent,
    BikeproductComponent,
    BugaticarComponent,
    SuzukiComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatToolbarModule,
    MatIconModule,
    BrowserAnimationsModule,
    MatButtonModule,
     HttpClientModule,
     MatMenuModule
      
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
