(ns district-registry.shared.smart-contracts-qa)

  (def smart-contracts
    {:ds-guard {:name "DSGuard" :address "0x9035a078ff39f58f715f2b110bdd8d536f558722"} :minime-token-factory {:name "MiniMeTokenFactory" :address "0x8607ad7faaf7010b704d03c3af3fdc0cd6abeffa"} :DNT {:name "District0xNetworkToken" :address "0xe450dcde6c059339a35eec0facbe62751cca6e8a"} :district-registry-db {:name "EternalDb" :address "0xb60090f3ac1c0de66d8ac77c0dff8886c4bbcdd6"} :param-change-registry-db {:name "EternalDb" :address "0xb933bc695da0c6a2e54bdec93c84994cc4822a3d"} :district-registry {:name "DistrictRegistry" :address "0xea9a079a8c89f1367dd1d656662e27d802577614"} :district-registry-fwd {:name "MutableForwarder" :address "0x52e0914215c344d6bbc8c1d47d52596240fb6699" :forwards-to :district-registry} :param-change-registry {:name "ParamChangeRegistry" :address "0xa7df6a7ba5d74d6dc842fe7b78944c9358ac09c7"} :param-change-registry-fwd {:name "MutableForwarder" :address "0x4e40a41cc5c98b687f0b65c9af2c795e7d2ac4fe" :forwards-to :param-change-registry} :power {:name "Power" :address "0x010c1dbfc108f8602ed7fa0c40310bdf38628326"} :stake-bank {:name "StakeBank" :address "0x00ecf8b7e2c75711eac7f7378df019f63a71a91b"} :challenge {:name "Challenge" :address "0xd433cb5f0b0a393ca256f1e8c0d75bd955154154"} :district-challenge {:name "DistrictChallenge" :address "0xd3bee3000e9cad338ac9b3172e44a061fbe850b8"} :ENS {:name "ENS" :address "0x98df287b6c145399aaa709692c8d308357bc085d"} :kit-district {:name "KitDistrict" :address "0x185d02c8be965939b964fd313823aff18987fdd0"} :district {:name "District" :address "0xe49781d7bf18dd4012297206043dfc25cad09137"} :param-change {:name "ParamChange" :address "0x475b7b1252986898da835c65a10a10e19b6b7b6a"} :district-factory {:name "DistrictFactory" :address "0x4425458c67966a7b407cb745c2b4ddf2703dc46c"} :param-change-factory {:name "ParamChangeFactory" :address "0x85ff298280c1f7328bab120f32c37b0a54df35ca"} :district0x-emails {:name "District0xEmails" :address "0x02c3c6effae96f45c61d96da4edc6a16851f9d48"}})
