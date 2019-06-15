(ns district-registry.shared.smart-contracts-dev)

  (def smart-contracts
    {:ds-guard {:name "DSGuard" :address "0x910ee5c549487be5cbc888d7aa8be28b2ed70162"} :minime-token-factory {:name "MiniMeTokenFactory" :address "0x3309866c3b322904fed3c616df3b5fdb958c9b24"} :DNT {:name "District0xNetworkToken" :address "0xdfe0c916f8d20c0605e4dbcd22d94e55b23f5b0a"} :district-registry-db {:name "EternalDb" :address "0x27c5142e3a28225b27360110f1a4291eac22aa04"} :param-change-registry-db {:name "EternalDb" :address "0x9e450cee3e657fce6ec277b9344d5fae774de2a4"} :district-registry {:name "DistrictRegistry" :address "0xda7c03a5dc4210bb40d4b2e4ac72f7615fb18bb8"} :district-registry-fwd {:name "MutableForwarder" :address "0x3c9cddeb9b90aed8f14680d7e6aea28dc525c7fa" :forwards-to :district-registry} :param-change-registry {:name "ParamChangeRegistry" :address "0x0d910d57d7f33d8ceff3ed088037ac81215bed8a"} :param-change-registry-fwd {:name "MutableForwarder" :address "0x8f05e55f663d7a1961c6d194427f597832ea5508" :forwards-to :param-change-registry} :power-factory {:name "PowerFactory" :address "0x9c9297159e84f624e3653b9a7d591d94b66759ea"} :stake-bank-factory {:name "StakeBankFactory" :address "0x36b030d54e85ba0be97a136b558873ad231412c0"} :challenge-factory {:name "ChallengeFactory" :address "0x3898ad3f9f11560132ce1de294e8cc95b26d86d5"} :district {:name "District" :address "0xf544f090614ace104a631c4e0c782889fa6d22ed"} :param-change {:name "ParamChange" :address "0x7fa768b0e81d9e1b6923411d083fe1631135ff19"} :district-factory {:name "DistrictFactory" :address "0xbf265c4a9dd7fb6ed1f3e30c1fff04a24aa92451"} :param-change-factory {:name "ParamChangeFactory" :address "0x73a5ed26a497605bd8ace02dde54002bdf89401e"}})