#import "JszhShareDemo.h"
#import <React/RCTLog.h>
#import <UIKit/UIKit.h>

@implementation JszhShareDemo

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(alert:(NSString *)string){

  RCTLogInfo(@"Pretending to create an event %@ at %@", string, nil);

  dispatch_async(dispatch_get_main_queue(), ^{
    UIAlertController *alertController = [UIAlertController alertControllerWithTitle:@"消息" message:string preferredStyle:UIAlertControllerStyleAlert];
          UIAlertAction *cancelAction = [UIAlertAction actionWithTitle:@"取消" style:UIAlertActionStyleCancel handler:nil];
          UIAlertAction *okAction = [UIAlertAction actionWithTitle:@"确定" style:UIAlertActionStyleDefault handler:^(UIAlertAction * _Nonnull action) {
              NSLog(@"确定");
          }];
          [alertController addAction:cancelAction];
          [alertController addAction:okAction];
    [[[UIApplication sharedApplication] keyWindow].rootViewController presentViewController:alertController animated:YES completion:nil];
  });

}

RCT_REMAP_METHOD(callbackData,resolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject){

  NSDictionary *dict = @{@"value" : @"Native - ios"};
  resolve(dict);

}

@end
