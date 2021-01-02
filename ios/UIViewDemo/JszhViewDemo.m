//
//  JszhViewDemo.m
//
//  Created by jszh on 2021/01/02.
//  Copyright © 2021 Facebook. All rights reserved.
//

#import "JszhViewDemo.h"

@implementation NativeViewDemo

RCT_EXPORT_MODULE();

-(UIView *)view
{
  UIView *myView = [[UIView alloc] initWithFrame:CGRectMake(10, 30, 200, 200)];
      myView.backgroundColor = [UIColor redColor];
      return myView;
}

@end
