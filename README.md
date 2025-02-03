# hotel-api

This is a service which provides APIs for operations related to hotel data.

## Steps to run application and test cases:

1. Make sure you have Maven, JDK 8 and Postman installed and path is configured.
2. Run ```mvn clean spring-boot:run``` in terminal to start the application.
3. Required data will be loaded in an in-memory H2 DB when the application boots up. Test APIs using Postman. 
4. Run ```mvn clean test``` to run the unit tests.

## Task 1

1. Create an API /hotel/{hotelId} to get details of a hotel by it's ID.

Sample request:
```
GET /hotel/1
```

Sample response:
```
200 OK
{
    "id": 1,
    "name": "Monaghan Hotel",
    "rating": 9.2,
    "city": {
        "id": 1,
        "name": "Amsterdam",
        "cityCentreLatitude": 52.36878,
        "cityCentreLongitude": 4.903303
    },
    "address": "Weesperbuurt en Plantage",
    "latitude": 52.364799,
    "longitude": 4.908971
}
```
2. Handle basic GET API scenarios with proper response codes.

## Task 2

1. Create an API /hotel/{hotelId} to delete a hotel using its id.<br />
The API should only logically delete the hotel and not actually eliminate the data from DB. 

Sample request:
```
DEL /hotel/1
```

Sample response:
```
200 OK
```
2. Handle basic DELETE API scenarios with proper response codes.

## Task 3

1. "**Haversine Formula**" is used to calculate distance between two pairs of latitude and longitude.<br />
   Create an API */search/{cityId}* which uses this formula to return list of top 3 hotels sorted by their distance from city center.
   (You can refer/copy the formula from internet).<br />The API should take a query parameter **sortBy** as input.

Sample request:
```
GET /search/1?sortBy=distance
```

Sample response:
```
200 OK

{
   //Top three hotels based on input parameter
}
```

2. Return proper response codes for different scenarios possible.

## Task 4

1. Add test cases for the pieces of code introduced by you in above tasks.
