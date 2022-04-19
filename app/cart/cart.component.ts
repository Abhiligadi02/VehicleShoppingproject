import { Component, OnInit } from '@angular/core';
import { CartapiService } from '../services/cartapi.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  totalItemNumber: number=0;
products:any=[];
allproducts:any = 0;
  cartApi: any;
  constructor(private carApi:CartapiService) { }

  ngOnInit(): void {
    this.carApi.getProductData().subscribe(res=>{
      this.totalItemNumber=res.length;
    })
    this.carApi.getProductData().subscribe(res=>{
      this.products=res;
      this.allproducts=this.carApi.getTotalAmount();
    })
  }
    removeProduct(item:any){
      this.carApi. removeCartData(item);
    }
    removeAllProduct(){
      this.carApi.removeAllCart();
    }
}
