# react-native-jszh-share-demo

## Getting started

`$ npm install react-native-jszh-share-demo --save`

### Mostly automatic installation

`$ react-native link react-native-jszh-share-demo`

## Usage
```javascript
import JszhShareDemo from 'react-native-jszh-share-demo';

JszhShareDemo.alert('123');
JszhShareDemo.callbackData((res)=>{
    alert(res.value)
});
```
