import { Component, OnInit } from '@angular/core';
import { ApiService } from '../services/api.service';
import { CartapiService } from '../services/cartapi.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  totalItemNumber: number=0;
productList:any;
  constructor(private api:ApiService,
    private carApi:CartapiService) { }

  ngOnInit(): void {
    this.carApi.getProductData().subscribe(res=>{
      this.totalItemNumber=res.length;
    })
    this.api.getProduct().subscribe(res=>{
      this.productList=res;
      this.productList.forEach((a:any)=> {
        Object.assign(a,{quantity:1,total:a.price})
      });
    })
  }
addtoCart(item:any){
  this.carApi.addToCart(item)
}
}

 