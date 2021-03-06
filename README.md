[![REUSE status](https://api.reuse.software/badge/github.com/SAP-samples/logistics-business-network-gtt-samples)](https://api.reuse.software/info/github.com/SAP-samples/logistics-business-network-gtt-samples) 
# Template Apps for SAP Logistics Business Network, Global Track and Trace Option

## Announcement (2020.12.21):
In this release, we have two new template apps: [Track Shipments app](https://github.com/SAP-samples/logistics-business-network-gtt-samples/tree/master/lbn-gtt-template-ts) and [Track Purchase Orders app](https://github.com/SAP-samples/logistics-business-network-gtt-samples/tree/master/lbn-gtt-template-tpo), you can find the code and documents in relevant folder.  </br>
We also upgrade Track Sales Orders app model, to adapt to the newest change, please upgrade your SOF model to the [newest SOF model version](https://github.com/SAP-samples/logistics-business-network-gtt-samples/blob/master/lbn-gtt-template-tso/Model/sof-model-2020122101.json).

## Description
You can find the template code for [SAP Logistics Business Network, global track and trace option]( https://help.sap.com/viewer/product/SAP_LBN_GTT_OPTION/LBN/en-US?task=discover_task) in this project. The project aims to provide examples to build your own tracking application based on the option. You can either implement the sample code or customize it to fit your needs. For each tracking scenario, the template code includes: 
* ERP extractor to send out the tracked process to global track and trace option (ABAP) 
* Tracked process model that needs to be imported into global track and trace option (model file) 
* Backend and frontend codes to build Fiori application on global track and trace option (Java and JavaScript)
 
## Requirements
* An SAP Cloud Platform global account with entitlement to the global track and trace option for SAP Logistics Business Network, 1 portal service quota and 2 GB Application Runtime quota
* To integrate with ERP, an SAP ERP or SAP ECC system running on Netweaver 7.31 or higher with SAP NOTE 2937175 being implemented
* To integrate with visibility provider, log your incidents in SAP BCP system with component “SCM-LBN-GTT-COR”

## Download and Installation
Click the link below to find the detailed installation guide for each tracking scenario. You can also find them in the “Document” folder of the corresponding scenario.
* Track Sales Orders app </br>
[01_Implementation_Guide-TSO.pdf](https://github.com/SAP-samples/logistics-business-network-gtt-samples/blob/master/lbn-gtt-template-tso/Documents/01_Implementation_Guide-TSO.pdf)  </br>
[02_Extractor_Creation_Guide-TSO.pdf](https://github.com/SAP-samples/logistics-business-network-gtt-samples/blob/master/lbn-gtt-template-tso/Documents/02_Extractor_Creation_Guide-TSO.pdf)  </br>

* Track Shipments app </br>
[01_Application_Introduction-TS.pdf](https://github.com/SAP-samples/logistics-business-network-gtt-samples/blob/master/lbn-gtt-template-ts/Documents/01_Application_Introduction-TS.pdf) </br>
[02_Implementation_Guide-TS.pdf](https://github.com/SAP-samples/logistics-business-network-gtt-samples/blob/master/lbn-gtt-template-ts/Documents/02_Implementation_Guide-TS.pdf) </br>
[03_Synchronize_Actual_Events_To_TM-TS.pdf](https://github.com/SAP-samples/logistics-business-network-gtt-samples/blob/master/lbn-gtt-template-ts/Documents/03_Synchronize_Actual_Events_To_TM-TS.pdf) </br>
[04_Extractor_Creation_Guide-TS.pdf](https://github.com/SAP-samples/logistics-business-network-gtt-samples/blob/master/lbn-gtt-template-ts/Documents/04_Extractor_Creation_Guide-TS.pdf)

* Track Purchase Orders app </br>
[01_Implementation_Guide-TPO.pdf](https://github.com/SAP-samples/logistics-business-network-gtt-samples/blob/master/lbn-gtt-template-tpo/Documents/01_Implementation_Guide-TPO.pdf) </br>
[02_Extractor_Creation_Guide-TPO.pdf](https://github.com/SAP-samples/logistics-business-network-gtt-samples/blob/master/lbn-gtt-template-tpo/Documents/02_Extractor_Creation_Guide-TPO.pdf) </br>


## Limitations
Click the link below to check the limitations of each tracking scenario. You can also find them in the “README.md” file of the corresponding scenario.
* [Track Sales Orders – Limitations](https://github.com/SAP-samples/logistics-business-network-gtt-samples/blob/master/lbn-gtt-template-tso/README.md#limitations)
* [Track Shipments – Limitations](https://github.com/SAP-samples/logistics-business-network-gtt-samples/blob/master/lbn-gtt-template-ts/README.md#limitations)
* [Track Purchase Orders – Limitations](https://github.com/SAP-samples/logistics-business-network-gtt-samples/blob/master/lbn-gtt-template-tpo/README.md#limitations)

## Known Issues
Click the link below to check known issues for each tracking scenario. You can also find them in the “README.md” file of the corresponding scenario.
* [Track Sales Orders – Known Issue](https://github.com/SAP-samples/logistics-business-network-gtt-samples/blob/master/lbn-gtt-template-tso/README.md#known-issue)
* [Track Purchase Orders – Known Issue](https://github.com/SAP-samples/logistics-business-network-gtt-samples/blob/master/lbn-gtt-template-tpo/README.md#known-issue)



## FAQs
Click the link below to check FAQs for each tracking scenario. You can also find them in the “README.md” file of the corresponding scenario.
* [Track Sales Orders – FAQ](https://github.com/SAP-samples/logistics-business-network-gtt-samples/blob/master/lbn-gtt-template-tso/README.md#faqs)
* [Track Shipments – FAQ](https://github.com/SAP-samples/logistics-business-network-gtt-samples/blob/master/lbn-gtt-template-ts/README.md#faqs)
* [Track Purchase Orders – FAQ](https://github.com/SAP-samples/logistics-business-network-gtt-samples/blob/master/lbn-gtt-template-tpo/README.md#faqs)

## How to Obtain Support
The project is provided "as-is", with no expected support. </br>
If your issue is concerned with global track and trace option, log your incident in SAP BCP system with component “SCM-LBN-GTT-COR”. 

For additional support, [ask a question in SAP Community](https://answers.sap.com/questions/ask.html?additionalTagId=73555000100800000602).

## License
Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved. This project is licensed under the Apache Software License, version 2.0 except as noted otherwise in the [LICENSE](https://github.com/SAP-samples/logistics-business-network-gtt-samples/blob/master/LICENSES/Apache-2.0.txt) file.   
